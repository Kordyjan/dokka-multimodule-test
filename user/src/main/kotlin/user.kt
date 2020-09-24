package com.example.user

import org.example.dependency.ArgumentType
import org.example.dependency.BaseClass
import org.example.dependency.depFunction

/**
 * dockie doc
 */
class MyOwnClass(val arg: ArgumentType): BaseClass()

/**
 * another function that uses [depFunction]
 */
fun use() = depFunction()
