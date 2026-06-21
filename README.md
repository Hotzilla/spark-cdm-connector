# ❗IMPORTANT NOTICE❗
This is unofficial spark3.5 migration of the Microsoft's CDM connector project.

The CDM library, which this connector is reliant on, is deprecating the CDM Schema Store. Please upgrade your connector version to the latest version [spark3.3-1.19.7](https://github.com/Azure/spark-cdm-connector/releases/tag/spark3.3-1.19.7) to ensure there is no disruption in your workflows.
Full details in: https://github.com/Azure/spark-cdm-connector/issues/162

# spark-cdm-connector

The Connector is now Generally Available in **Azure Spark for Azure Synapse**. The connector allows Spark dataframes to read and write entities in a CDM folder format residing on ADLS. To get started, please see [Using the Spark CDM Connector](documentation/overview.md).

Be sure to check the [issues](https://github.com/Azure/spark-cdm-connector/issues) and search the error message before sending mail to asksparkcdm@microsoft.com for questions or feedback.

For more information about CDM see: https://docs.microsoft.com/en-us/common-data-model/ 

Samples to use the connector with Python and Scala can be found here:
  - [Python sample](samples/SparkCDMsamplePython.ipynb)
  - [Scala sample](samples/SparkCDMsample.scala)

## Creating a Spark 3.5 GitHub release

This repository includes a GitHub Actions workflow named **Release Spark 3.5 jar** that builds the Spark 3.5 assembly jar and attaches it to a GitHub release.

### What the workflow produces

The release workflow runs `sbt clean assembly`, verifies that `build.sbt` is configured for a `spark3.5-*` connector version and Spark 3.5 dependencies, then uploads the generated assembly jar as:

```text
spark-cdm-connector-<release-tag>.jar
```

Use that jar as the connector artifact for Spark, for example with `spark-submit --jars /path/to/spark-cdm-connector-<release-tag>.jar` or by installing it through your Spark platform's library or workspace package UI.

### How to trigger a release manually

1. Push this workflow to GitHub on your release branch.
2. Open the repository in GitHub.
3. Go to **Actions**.
4. Select **Release Spark 3.5 jar**.
5. Click **Run workflow**.
6. Enter the release tag. The default is `spark3.5-1.19.7`.
7. Choose whether the release should be marked as a prerelease.
8. Click **Run workflow**.

The workflow requires the repository's default `GITHUB_TOKEN` to have permission to write repository contents. If your organization restricts token permissions, enable **Read and write permissions** under **Settings > Actions > General > Workflow permissions**.

### How to trigger a release from a tag

You can also create a release by pushing a tag whose name starts with `spark3.5-`:

```bash
git tag spark3.5-1.19.7
git push origin spark3.5-1.19.7
```

When a matching tag is pushed, the workflow builds the jar and creates a GitHub release for that tag.
