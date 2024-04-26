package com.example.phonemanager.utils

enum class Action {
    ADD,
    UPDATE,
    DELETE,
    NO_ACTION
}

fun String?.toAction(): Action {
    return if (this.isNullOrEmpty()) Action.NO_ACTION else Action.valueOf(this)
}