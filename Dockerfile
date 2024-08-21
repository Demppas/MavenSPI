FROM ubuntu:latest
LABEL authors="denni"

ENTRYPOINT ["top", "-b"]