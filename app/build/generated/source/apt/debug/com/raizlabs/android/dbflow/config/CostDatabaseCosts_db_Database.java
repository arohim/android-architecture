package com.raizlabs.android.dbflow.config;

import com.kodelabs.mycosts.storage.model.Cost;
import com.kodelabs.mycosts.storage.model.Cost_Adapter;
import com.raizlabs.android.dbflow.structure.database.FlowSQLiteOpenHelper;
import com.raizlabs.android.dbflow.structure.database.OpenHelper;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class CostDatabaseCosts_db_Database extends BaseDatabaseDefinition {
  public CostDatabaseCosts_db_Database(DatabaseHolder holder) {
    holder.putDatabaseForTable(Cost.class, this);
    models.add(Cost.class);
    modelTableNames.put("Cost", Cost.class);
    modelAdapters.put(Cost.class, new Cost_Adapter(holder));
  }

  @Override
  public final OpenHelper createHelper() {
    return new FlowSQLiteOpenHelper(this, internalHelperListener);
  }

  @Override
  public final boolean isForeignKeysSupported() {
    return false;
  }

  @Override
  public final boolean isInMemory() {
    return false;
  }

  @Override
  public final boolean backupEnabled() {
    return false;
  }

  @Override
  public final boolean areConsistencyChecksEnabled() {
    return false;
  }

  @Override
  public final int getDatabaseVersion() {
    return 1;
  }

  @Override
  public final String getDatabaseName() {
    return "Costs_db";
  }
}
