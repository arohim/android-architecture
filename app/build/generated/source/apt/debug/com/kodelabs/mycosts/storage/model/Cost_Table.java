package com.kodelabs.mycosts.storage.model;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.DoubleProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.LongProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Date;

/**
 * This is generated code. Please do not modify */
public final class Cost_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.kodelabs.mycosts.storage.model.Cost_Table.getProperty(columnName); 
  }
  };

  public static final LongProperty id = new LongProperty(Cost.class, "id");

  public static final Property<String> category = new Property<String>(Cost.class, "category");

  public static final Property<String> description = new Property<String>(Cost.class, "description");

  public static final Property<Date> date = new Property<Date>(Cost.class, "date");

  public static final DoubleProperty amount = new DoubleProperty(Cost.class, "amount");

  public static final Property<Boolean> synced = new Property<Boolean>(Cost.class, "synced");

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`category`":  {
        return category;
      }
      case "`description`":  {
        return description;
      }
      case "`date`":  {
        return date;
      }
      case "`amount`":  {
        return amount;
      }
      case "`synced`":  {
        return synced;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
