# IAL Concepts

The instrumentation aspect lanugage comprises four central concepts,
namely:
- the ApplicationModelHandle
- the Advice
- the Pointcut, and
- the composition of the latter two, the Aspect.
They utilize further language rules, but form the core of the language.

## ApplicationModelHandle

The `ApplicationModelHandle` refers to an application `model` with an
URI provided as string, which can identifiy a folder, file or model.
Depending on the kind of model, it is necessary to provide a handler by
ID. Presently, these are `pcm` and `java`, but could be extended for
other environments. In case of models, a mapping file, called `traceModel`
must be specified to relate model elements to code elements.

`
ApplicationModelHandle:
	'map' handler=ID 'model' name=ID model=STRING ('trace' traceModel=STRING)?
;
`

## Advice

An advice allows to group multiple collectors together and define how
they must be joined with the code. Presently there are three types
available:
- before = before the actual operation
- after = after the actual operation
- exception = after an exception occured

Furthermore, for each collector, multiple events can be specified,
which are the collected by the tooling.

`
Advice:
	'advice' name=ID '{'
		collectors+=Collector*
	'}'
;

Collector:
	insertionPoint=InsertionPoint events+=Event+
;
`


## Pointcut

Pointcuts are rather complex. They have two modifiers. First, they can
be defined as `adaptive` or `static`. Where `static`is the default. An
adaptive pointcut can be activated and deactivated at runtime, while a
static pointcut is always active. Second, a pointcut can be define to
`cascade`. This implies that not only a function or method is
instrumented, but also all methods called by that function or method,
and all which are called by these functions.

`
Pointcut:
	(annotation=Annotation)?
	(adaptive?='adaptive'|'static')? (cascade?='cascade')? 'pointcut' name=ID
	'class' model=[ApplicationModelHandle|ID] '.' location=LocationQuery 
	('operation' operation=OperationQuery)?
;

The core of the pointcut is the `LocationQuery` which allows to select
major code elements, like components, classes, modules and units. It can
be refined by limiting the search to a specific set of operations.
Furthermore, it is necessary to refer to on application model, via its
handle.





