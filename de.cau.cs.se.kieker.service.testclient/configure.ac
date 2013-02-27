#                                               -*- Autoconf -*-
# Process this file with autoconf to produce a configure script.

AC_PREREQ([2.69])
AC_INIT(kieker-library, 0.1, rju@informatik.uni-kiel.de)
AM_INIT_AUTOMAKE(testclient, 0.1)
LT_INIT()
AC_SUBST([LIBTOOL_DEPS])
AC_CONFIG_SRCDIR(src/testclient.c)
AM_CONFIG_HEADER(config.h)
AC_CONFIG_MACRO_DIR([m4])

# Checks for programs.
AC_PROG_CC

# Checks for libraries.

# Checks for header files.
AC_CHECK_HEADERS([arpa/inet.h netdb.h netinet/in.h stdlib.h string.h strings.h sys/socket.h sys/time.h syslog.h unistd.h])

# Checks for typedefs, structures, and compiler characteristics.

# Checks for library functions.
AC_FUNC_ERROR_AT_LINE
AC_CHECK_FUNCS([gethostbyname gettimeofday socket strerror])

AC_CONFIG_FILES([Makefile
                 src/Makefile
                 src/kieker/Makefile])
AC_OUTPUT
