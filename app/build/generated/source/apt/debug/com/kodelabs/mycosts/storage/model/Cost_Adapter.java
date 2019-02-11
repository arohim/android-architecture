package com.kodelabs.mycosts.storage.model;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.converter.DateConverter;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.Method;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Date;

public final class Cost_Adapter extends ModelAdapter<Cost> {
  private final DateConverter global_typeConverterDateConverter;

  public Cost_Adapter(DatabaseHolder holder) {
    global_typeConverterDateConverter = (DateConverter) holder.getTypeConverterForClass(Date.class);
  }

  @Override
  public final Class<Cost> getModelClass() {
    return Cost.class;
  }

  public final String getTableName() {
    return "`Cost`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Cost model) {
    values.put("`id`", model.getId());
    if (model.getCategory() != null) {
      values.put("`category`", model.getCategory());
    } else {
      values.putNull("`category`");
    }
    if (model.getDescription() != null) {
      values.put("`description`", model.getDescription());
    } else {
      values.putNull("`description`");
    }
    Long refdate = model.getDate() != null ? global_typeConverterDateConverter.getDBValue((java.util.Date) model.getDate()) : null;
    if (refdate != null) {
      values.put("`date`", refdate);
    } else {
      values.putNull("`date`");
    }
    values.put("`amount`", model.getAmount());
    values.put("`synced`", model.synced ? 1 : 0);
  }

  @Override
  public final void bindToContentValues(ContentValues values, Cost model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Cost model, int start) {
    statement.bindLong(1 + start, model.getId());
    if (model.getCategory() != null) {
      statement.bindString(2 + start, model.getCategory());
    } else {
      statement.bindNull(2 + start);
    }
    if (model.getDescription() != null) {
      statement.bindString(3 + start, model.getDescription());
    } else {
      statement.bindNull(3 + start);
    }
    Long refdate = model.getDate() != null ? global_typeConverterDateConverter.getDBValue((java.util.Date) model.getDate()) : null;
    if (refdate != null) {
      statement.bindLong(4 + start, refdate);
    } else {
      statement.bindNull(4 + start);
    }
    statement.bindDouble(5 + start, model.getAmount());
    statement.bindLong(6 + start, model.synced ? 1 : 0);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Cost model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Cost`(`id`,`category`,`description`,`date`,`amount`,`synced`) VALUES (?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Cost`(`id`,`category`,`description`,`date`,`amount`,`synced`) VALUES (?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Cost`(`id` INTEGER,`category` TEXT,`description` TEXT,`date` INTEGER,`amount` REAL,`synced` INTEGER, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Cost model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.setId(cursor.getLong(indexid));
    } else {
      model.setId(0);
    }
    int indexcategory = cursor.getColumnIndex("category");
    if (indexcategory != -1 && !cursor.isNull(indexcategory)) {
      model.setCategory(cursor.getString(indexcategory));
    } else {
      model.setCategory(null);
    }
    int indexdescription = cursor.getColumnIndex("description");
    if (indexdescription != -1 && !cursor.isNull(indexdescription)) {
      model.setDescription(cursor.getString(indexdescription));
    } else {
      model.setDescription(null);
    }
    int indexdate = cursor.getColumnIndex("date");
    if (indexdate != -1 && !cursor.isNull(indexdate)) {
      model.setDate(global_typeConverterDateConverter.getModelValue((java.lang.Long) cursor.getLong(indexdate)));
    } else {
      model.setDate(null);
    }
    int indexamount = cursor.getColumnIndex("amount");
    if (indexamount != -1 && !cursor.isNull(indexamount)) {
      model.setAmount(cursor.getDouble(indexamount));
    } else {
      model.setAmount(0);
    }
    int indexsynced = cursor.getColumnIndex("synced");
    if (indexsynced != -1 && !cursor.isNull(indexsynced)) {
      model.synced = cursor.getInt(indexsynced) == 1 ? true : false;
    } else {
      model.synced = false;
    }
  }

  @Override
  public final boolean exists(Cost model) {
    return new Select(Method.count()).from(Cost.class).where(getPrimaryConditionClause(model)).count() > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Cost model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Cost_Table.id.eq(model.getId()));return clause;
  }

  @Override
  public final Cost newInstance() {
    return new Cost();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Cost_Table.getProperty(name);
  }
}
