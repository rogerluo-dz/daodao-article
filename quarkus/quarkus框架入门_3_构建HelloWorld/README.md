# Quarkus框架入门 - （3）构建HelloWorld

## 前言

上一节我们详细分析讲解了整个 `HelloWorld` 项目，这一节我们开始介绍尝试编译构建这个项目。

## 坑位预警

> 所谓坑位预警，就是我会把趟过的各种大坑小坑，放到文章开头的这里进行说明，让大伙们首先有个心理预期...毕竟在这个世界上，除了坑，就只有坑了（捂脸）。

1. `Quarkus` 这个框架可以用平时的 `Java JDK` 环境就可以进行开发调试，但是如果想体验 `Native` 原生的话，本地机器里还需要安装 `Graalvm`，以及 `(windows)Visual Studio 2017` 或者 `(macOS)XCode` 才可以构建native应用，光这个 `Visual Studio` 就好几个GB嘞... 当然也可以在本地安装 `docker` 环境，用 `docker` 镜像去构建。
2. 如果想用 `docker` 环境去构建的话，就引出**第二个大坑**（我就掉进去了一周而已...），现在的 `Quarkus` 暂不支持调用远程 `docker` 去构建，因为构建命令是使用 `-v` 参数将jar包引用到镜像里面做原生构建，这样就会发生将本地的路径直接贴到了 `-v` 后面了。具体问题可参考 [issues-1610](https://github.com/quarkusio/quarkus/issues/1610)。


## 最后的话

下一节我们开始介绍>>>>>>>。敬请关注~

## 参考文章

[1] [Quarkus官方教程：Build a native executable](https://quarkus.io/guides/building-native-image)

[2] [Quarkus官方教程：Getting started](https://quarkus.io/guides/getting-started)
