File file = new File("/home/sch/Private/Workspace/dropwizard-example/.idea/compiler.xml")


if (file.exists()) {
    Node parsedXml = new XmlParser().parse(file)

    Node compilerConfiguration = parsedXml.component.find {component -> component.'@name' == 'CompilerConfiguration'
    }

    def annotationProcessingNode = compilerConfiguration.annotationProcessing.replaceNode {
        annotationProcessing {
            profile(default: 'true', name: 'HEHE', enabled: 'true') {
                sourceOutputDir(name: 'shit')
                sourceTestOutputDir(name: '')
                outputRelativeToContentRoot(value: 'true')
                processorPath(useClasspath: 'true')
            }
        }
    }


    def writer = new FileWriter(file)
    new XmlNodePrinter(new PrintWriter(writer)).print(parsedXml)

    println annotationProcessingNode
}





//currentAnnotationProcessing.replaceNode {
//    //                        annotationProcessing {
////                            profile(default: 'true', name: 'HEHE', enabled: 'true') {
////                                sourceOutputDir(name: 'shit')
////                                sourceTestOutputDir(name: '')
////                                outputRelativeToContentRoot(value: 'true')
////                                processorPath(useClasspath: 'true')
////                            }
////                        }
////                    }

