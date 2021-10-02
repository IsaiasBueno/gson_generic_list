package com.isaiasbueno.gson_generic_list

data class User(val name: String,
                val likesOranges: Boolean) {
    override fun toString() = "$name - $likesOranges"
}