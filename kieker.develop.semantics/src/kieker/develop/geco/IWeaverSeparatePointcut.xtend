/***************************************************************************
 * Copyright 2017 GECO Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package kieker.develop.geco

/**
 * 
 * @author Reiner Jung
 * 
 * @param <B> base metamodel root class
 * @param <P> pointcut metamodel root class
 * @param <A> aspect metamodel root class
 * 
 * @since 1.0
 */
interface IWeaverSeparatePointcut<B,P,A> {
	
	/**
	 * Weave an aspect model into the base model. The pointcut
	 * is provided by the weave method itself.
	 *  
	 * Note: It is assumed that the returned model is the same
	 * model as the baseModel and not a copy of the model.
	 * 
	 * @param baseModel the base model
	 * @param pointcutModel the pointcut or join point model
	 * @param adviceModel the advice to be woven into
	 * 
	 * @returns the woven model 
	 */
	def B weave(B baseModel, P pointcutModel, A adviceModel)
}
