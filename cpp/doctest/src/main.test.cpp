#define DOCTEST_CONFIG_IMPLEMENT_WITH_MAIN

#include "doctest.h"

SCENARIO("some test nonsense")
{
    GIVEN("truthy equals 1")
    {
        int isTrue = 1;

        WHEN("falsy equals 2")
        {
            int isFalse = 1;

            THEN("they should be the same, but they never will be...")
            {
                CHECK(isTrue == isFalse);
            }
        }
    }
}