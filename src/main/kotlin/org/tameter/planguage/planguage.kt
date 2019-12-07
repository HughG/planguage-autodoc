package org.tameter.planguage

//interface TextOrTag

inline class Tag(private val string : String) /*: TextOrTag*/ {
    override fun toString(): String = string
}
//inline class Text(private val string : String) : TextOrTag

interface TaggedBase<out T : Tag?> {
    /**
     * The __Tag__ (Concept 146) of an item is a unique, hierarchical ID for an item in a specification.
     */
    val tag : T
}

interface Tagged : TaggedBase<Tag>

interface MaybeTagged : TaggedBase<Tag?>

interface TaggedWithClassName : Tagged {
    override val tag: Tag
        get() = Tag(this::class.qualifiedName!!)
}


/*
 * Note: There's no obvious way to constrain the types of things referenced by tags, but there might be some way to
 * automate that check, for design specification quality.
 */

/*
 * Issue: I want a custom dokka output so it will list properties in the order they're inherited, not in alphabetical
 * order.  Even better if it could sub-group them by the interface they first come from.  Both of those ordering should
 * be breadth-first, not depth-first, I think.
 *
 * See https://medium.com/@flbenz/how-does-kotlins-documentation-engine-dokka-work-and-can-it-be-extended-5e83dc663ef7
 * for an idea of how to extend dokka.
 */


//class Qualifier : MaybeTagged
