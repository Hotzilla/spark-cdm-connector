package com.microsoft.cdm.utils

import com.microsoft.commondatamodel.objectmodel.storage.CdmStandardsAdapter

class OverridenCdmStandardsAdapter @throws[ClassNotFoundException] extends CdmStandardsAdapter {
  override def fetchConfig(): String = {
    "{\"config\":{},\"type\": \"cdm-standards\"}"
  }
}
