<?php


use PHPUnit\Framework\TestCase;

class AClassTest extends TestCase
{

    public function testAMethodWorksAsExpected()
    {
        $sut = new AClass();
        $this->assertEquals(0, $sut->aMethod());
    }
}
