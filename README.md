# Immunizer: The Collaborative Cloud-based Unsupervised Software Immunity Framework.

Immunizer strives to empower software applications with *artificial immunity* against cyber attacks.
To achieve this goal, Immunizer enables applications themselves to play a *central* and *active* role in the intrusion detection and response processes. While traditional network and host intrusion detection systems have access to raw strings and bytes through I/O operations only, Immunizer allows tracking application domain objects all along the processing lifecycle.

Thanks to unsupervised learning, Immunizer leverages the application business context and learns from production data, without creating any training burden on the application owner. Moreover, as Immunizer uses runtime application instrumentation, it incurs no additional cost on the application provider.

Immunizer leverages cloud-based collaboration to create and manage software communities whose members automatically share security alarms and learn from each other. This allows Immunizer to evolve from empowering applications with immunity like the *human body*, to providing them with a sense of belonging and an ability to collaborate like in *human societies*.

In terms of effectiveness, Immunizer R-precision exceeds 97%, while its cloud-based, fully-distributed and parallelized microservices architecture provides high performance and scalability.

## Architecture

Immunizer is made of several modules/layers, each designed and implemented as either an in-app microagent, an on-premise microservice, or a cloud microservice. These are:
- [Monitoring Microagent](https://github.com/oiraqi/immunizer-monitoring)
- [Response Microagent](https://github.com/oiraqi/immunizer-response)
- [Acquisition Microservice](https://github.com/oiraqi/immunizer-acquisition)
- [Analysis Microservice](https://github.com/oiraqi/immunizer-analysis)
- [Collaboration Microservice](https://github.com/oiraqi/immunizer-collaboration)
- [Dashboard Microservice](https://github.com/oiraqi/immunizer-dashboard)

Communication among these modules/layers is based on streams and is performed asynchronously, through brokers.

## Articles & Papers
- Omar Iraqi and Hanan El Bakkali, “Application-Level Unsupervised Outlier-Based Intrusion Detection and Prevention,” Security and Communication Networks, vol. 2019, Article ID 8368473, 13 pages, 2019. https://doi.org/10.1155/2019/8368473
- Omar Iraqi, Meryeme Ayach and Hanan El Bakali, "Collaborative Cloud-based Application-level Intrusion Detection and Prevention", ICWMC 2019 : The Fifteenth International Conference on Wireless and Mobile Communications, IARIA.
- Iraqi O., El Bakkali H. (2017) Toward Third-Party Immune Applications. In: Rak J., Bay J., Kotenko I., Popyack L., Skormin V., Szczypiorski K. (eds) Computer Network Security. MMM-ACNS 2017. Lecture Notes in Computer Science, vol 10446. Springer, Cham
