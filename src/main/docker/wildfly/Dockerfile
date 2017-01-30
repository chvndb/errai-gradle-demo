FROM jboss/wildfly:10.1.0.Final

RUN cd /opt/jboss/wildfly/standalone/configuration/ && \
    sed -i 's|<deployment-scanner|<deployment-scanner auto-deploy-exploded="true"|g' standalone.xml
