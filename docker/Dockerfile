FROM ubuntu:18.04

WORKDIR /opt

COPY settings.xml /opt/settings.xml

RUN mkdir /opt/repository && chmod 777 /opt/repository

RUN apt-get update -qq && \
    apt-get install -y openjdk-8-jdk && \
    apt-get install -y ca-certificates git maven --no-install-recommends && \
    apt-get clean && rm -rf /var/lib/apt/lists/*

# Fix for "java.security.InvalidAlgorithmParameterException: the trustAnchors parameter must be non-empty"
RUN update-ca-certificates -f

# end

