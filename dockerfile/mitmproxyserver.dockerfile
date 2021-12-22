FROM python:3

WORKDIR /data

# ADD ./clients /data/clients
# ADD ./mitmproxy /data/mitmproxy

ADD ./ /data/

COPY ./dockerfile/sources.bullseye.list /etc/apt/sources.list
RUN cat /etc/apt/sources.list
RUN rm -Rf /var/lib/apt/lists/*

# COPY ./dockerfile/ca-rsa-public.crt /etc/ssl/certs/ca-rsa-public-private.crt
# COPY ./dockerfile/ca-rsa-private.key /etc/ssl/private/ca-rsa-private.key
# COPY ./dockerfile/ca-certificate-ec.crt /etc/ssl/certs/ca-certificate-ec.crt

# RUN chmod 644 /etc/ssl/certs/ca-rsa-public-private.crt

RUN apt-get update \
    && apt-get install -y --no-install-recommends ca-certificates jq curl
    
# netcat wget

RUN update-ca-certificates

RUN pip install -i https://pypi.tuna.tsinghua.edu.cn/simple pip -U
RUN pip config set global.index-url https://pypi.tuna.tsinghua.edu.cn/simple
RUN pip install -r /data/requirements.txt

# CMD [ "sh", "./run-test.sh", "./test.py" ]