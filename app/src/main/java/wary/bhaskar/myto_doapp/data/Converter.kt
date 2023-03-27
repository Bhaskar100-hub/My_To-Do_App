package wary.bhaskar.myto_doapp.data

import androidx.room.TypeConverter
import wary.bhaskar.myto_doapp.data.models.Priority

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }

}