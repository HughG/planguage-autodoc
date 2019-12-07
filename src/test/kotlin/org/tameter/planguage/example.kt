package org.tameter.planguage


class MyReq1 : FunctionRequirement() {
    override val impactedBy: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    /**
     * * [MyReq2]
     * * [MyReq3]
     */
    override val linkedTo: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val rationale: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val value: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val assumptions: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val dependencies: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val risks: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val priority: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val issues: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val test: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val subFunctions: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}

/**
 * Here is the Gist.
 *
 * And here is some description.
 */
abstract class MyReq2 : FunctionRequirement() {
    override val impactedBy: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    /**
     * * [MyReq1]
     * * [MyReq3]
     */
    override val linkedTo: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}

abstract class MyReq3 : FunctionRequirement() {
    override val impactedBy: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    /**
     * * [MyReq1]
     * * [MyReq2]
     */
    override val linkedTo: Any
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}