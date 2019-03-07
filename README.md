# implement a list by storing data in an encapsulated array

Design `List_inArraySlots` to implement a list of integers.
It is required to be able to store any values that
an `int` can hold, in consecutive slots of an array of `int`s.

In general, the array will be only partially populated with list elements.
That is, the array is generally larger than this list.
Occasionally, the array can be completely full, but adding
another element to the list will cause the `List_inArraySlots`
class to`expand()` the list (see the header comments for that
method in the skeleton.

That requirement "to store any values that an `int` can hold"
implies that the implementation can **not** identify the end of the list
by the values of the integers stored in the list. That design decision
would require reserving one integer value as a value that cannot be
stored in the list.
