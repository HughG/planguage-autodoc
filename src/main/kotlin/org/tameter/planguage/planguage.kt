package org.tameter.planguage

interface TaggedBase<out T : String?> {
    val tag : T
}

interface Tagged : TaggedBase<String>

interface MaybeTagged : TaggedBase<String?>

abstract class TaggedWithClassName : Tagged {
    override val tag: String = this::class.qualifiedName!!
}

//class Qualifier : MaybeTagged

sealed class Requirement : TaggedWithClassName()
