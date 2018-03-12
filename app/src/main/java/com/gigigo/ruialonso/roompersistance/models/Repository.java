package com.gigigo.ruialonso.roompersistance.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.NonNull;
import com.gigigo.ruialonso.roompersistance.utils.DateConverter;
import java.util.Date;
import org.jetbrains.annotations.NotNull;

@Entity(
    foreignKeys = {
      @ForeignKey(entity = User.class, parentColumns = "id", childColumns = "user_id", onDelete = ForeignKey.CASCADE)
    },
    indices = { @Index(value = "user_id") })
@TypeConverters(DateConverter.class)
public class Repository {
  @PrimaryKey(autoGenerate = true) @NonNull public int id;

  public String name;

  public String url;

  @ColumnInfo(name = "user_id") @NotNull public int userId;

  public Date creationDate;
}
