package org.tameter.planguage

/**
 * The __Gist__ of an item is a short single sentence; this system uses the first paragraph of the class or object
 * comment in KDoc, the summary.
 *
 * The __Description__ (Concept 416) of an item consists of words, diagrams, etc. which (inevitably only partly) define
 * that item.  This system uses the rest of the KDoc class or object comment.
 */
sealed class Item<out T : Tag?> : TaggedBase<T>

interface Relationships {
    /**
     * _List the tags of any Design Ideas or Evo Steps delivering, or capable of delivering, this function. The actual
     * item is NOT modified by any Design Ideas, but its presence in the system is, or can be, altered in some way. This
     * is an Impact Estimation table relationship._
     */
    val impactedBy : Any // Collection<Tag>

    /**
     * _List names or tags of any other system specifications, which this one is related to intimately, in addition to
     * the above specified hierarchical function relations and Impact-Estimation-related links. Note: an alternative way
     * is to express such a relationship is to use Supports or Is Supported By, as appropriate._
     */
    val linkedTo : Any // Collection<TextOrTag>

}

interface PriorityAndRiskManagement {
    /** _Justifies the existence of this function; why is it necessary?_ */
    val rationale : Any // Text

    /**
     * _Name (Stakeholder, time, place, event): Quantify, or express in words, the value claimed as a result of
     * delivering the requirement._
     */
    val value : Any // Text

    /**
     * _Specify, or refer to tags of any assumptions in connection with this function, which could cause problems if
     * they were not true, or later became invalid._
     */
    val assumptions : Any // Collection<TextOrTag>

    /**
     * _Using text or tags, name anything, which is dependent on this function in any significant way, or which this
     * function itself, is dependent on in any significant way._
     */
    val dependencies : Any // Collection<TextOrTag>

    /**
     * _List or refer to tags of anything, which could cause malfunction, delay, or negative impacts on plans,
     * requirements and expected results._
     */
    val risks : Any // Collection<TextOrTag>

    /**
     * _Name, using tags, any system elements, which this function can clearly be done after or must clearly be done
     * before. Give any relevant reasons._
     */
    val priority : Any // Collection<Tag>

    /**
     * _State any known issues; that is, unresolved concerns._
     */
    val issues : Any // Collection<Text>
}

sealed class Requirement : Item<Tag>(), TaggedWithClassName,
    Relationships,
    PriorityAndRiskManagement

interface FunctionMeasurement {
    /**
     * _Refer to tags of any test plan or/and test cases, which deal with this function (or describe in words how it
     * will or could be tested)._
     */
    val test : Any // Collection<TextOrTag>
}

interface FunctionRelationships : Relationships {
    /**
     * _List the tags of any immediate Sub-Functions (that is, the next level down), of this function._
     *
     * _Note: alternative ways of expressing Sub-Functions are Includes and Consists Of._
     */
    val subFunctions : Any // Collection<Tag>
}

abstract class FunctionRequirement : Requirement(),
    FunctionRelationships,
    FunctionMeasurement

// TODO: Should have base class for other kinds of constraint?
abstract class DesignConstraint : Requirement()


sealed class ScalarRequirement : Requirement() {

}
