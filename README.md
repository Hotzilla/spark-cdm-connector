# ❗IMPORTANT NOTICE❗
The CDM library, which this connector is reliant on, is deprecating the CDM Schema Store. Please upgrade your connector version to the latest version [spark3.3-1.19.7](https://github.com/Azure/spark-cdm-connector/releases/tag/spark3.3-1.19.7) to ensure there is no disruption in your workflows.
Full details in: https://github.com/Azure/spark-cdm-connector/issues/162

# spark-cdm-connector

The Connector is now Generally Available in **Azure Spark for Azure Synapse**. The connector allows Spark dataframes to read and write entities in a CDM folder format residing on ADLS. To get started, please see [Using the Spark CDM Connector](documentation/overview.md).

Be sure to check the [issues](https://github.com/Azure/spark-cdm-connector/issues) and search the error message before sending mail to asksparkcdm@microsoft.com for questions or feedback.

For more information about CDM see: https://docs.microsoft.com/en-us/common-data-model/ 

Samples to use the connector with Python and Scala can be found here:
  - [Python sample](samples/SparkCDMsamplePython.ipynb)
  - [Scala sample](samples/SparkCDMsample.scala)
