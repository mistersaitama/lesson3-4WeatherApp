package kg.geektech.weatherapp.data.models.converters;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import kg.geektech.weatherapp.data.models.Clouds;
import kg.geektech.weatherapp.data.models.Main;
import kg.geektech.weatherapp.data.models.Sys;

public class MainConverter {
    @TypeConverter
    public String fromCloudString(Main main) {
        if (main == null) {
            return null;
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Main>() {
        }.getType();
        return gson.toJson(main, type);
    }

    @TypeConverter
    public Clouds fromCloudString(String mainString) {
        if (mainString == null) {
            return (null);
        }
        Gson gson = new Gson();
        Type type = new TypeToken<Main>() {
        }.getType();
        return gson.fromJson(mainString, type);
    }
}
