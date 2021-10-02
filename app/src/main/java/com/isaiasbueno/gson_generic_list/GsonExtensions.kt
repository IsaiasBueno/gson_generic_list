package com.isaiasbueno.gson_generic_list

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


inline fun <reified T> Gson.fromJson(json: String) =
    this.fromJson<T>(json, object : TypeToken<T>(){}.type)