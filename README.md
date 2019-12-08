# planguage-autodoc
An exploration of how to write specifications in planguage using programming language autodoc tools.

I've repeatedly considered using clever documentation tools to write structured specifications using
Tom Gilb's planguage, in a way which could be easily used by developers while remaining accessible to
(semi-)technical non-developers.  For example, I considered writing a custom extension for Sphinx.

Then it occurred to me that there are structured documentation tools available to most developers
which can at least be read by non-developers and, with smart enough source hosting, commented on as
well: auto-documentation tools.  So, I'm going to populate this repository with an example of how to
use Kotlin's KDoc tool for this, and then possibly also Doxygen.  The ideal would be to have a doc
format which is terse to write, clear to read, and supports smart previewing and navigation in an IDE.
KDoc is a good fit for this (at least, with IntelliJ IDEA), and Doxygen probably is -- not sure about
IDE integration yet.  Javadoc and C#/VB.NET docuementation would be usable but is more verbose to write.

I'm likely to represent requirements and other specification items as either classes or singleton
objects -- not because they conceptually _are_ classes, but because with code plus autodoc tools those
are likely to be the easiest language objects with which to declare things which have a name, where
the name could be found at runtime, and with aggregated "things" (fields/properties) with their own
documentation, to represent the fields of a specification item.  I'm not mainly intending that these
delcared things be used in a programmatic way, mainly that they can be referenced by each other and
from "real" code.  However, it might be handy if they could be, to automate checking of specification
quality etc. (e.g., find all Function Requirements for which no Tests are defined).

This approach would make it harder for less technical customers and stakeholders to contribute to
requirements, but I find myself repeatedly working in projects where written requirements and
designs are only created to drive the next implementation step, and not to build up into a clear
picture to help developers maintain code.  So I'd like to play with this to see if it gives developers
a suitable way to record the details of the requirements and designs they most need to know about.
