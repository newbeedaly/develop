# dubbo-nacos

#### 介绍

https://nacos.io/zh-cn/docs/quick-start.html

#### 安装教程

wget https://github.com/alibaba/nacos/releases/download/2.1.2/nacos-server-2.1.2.zip

#### 使用说明

```
unzip nacos-server-$version.zip 或者 tar -xvf nacos-server-$version.tar.gz
cd nacos/bin
# linux / unix / mac
sh startup.sh -m standalone
# ubuntu 
bash startup.sh -m standalone
# window
startup.cmd -m standalone

# docker
$ docker run --name nacos -d -p 8848:8848 -p 9848:9848 -e MODE=standalone docker.io/nacos/nacos-server:v2.2.3
```
