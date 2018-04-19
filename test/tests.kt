import kotlin.test.assertEquals
import org.junit.Test as test

class TestSource {
    private val logic = Logic()

    @test
    fun testV1FirstExample() {
        assertEquals(3, logic.version1("1122"))
    }

    @test
    fun testV1SecondExample() {
        assertEquals(4, logic.version1("1111"))
    }

    @test
    fun testV1ThirdExample() {
        assertEquals(0, logic.version1("1234"))
    }

    @test
    fun testV1FourthExample() {
        assertEquals(9, logic.version1("91212129"))
    }

    @test
    fun testV2FirstExample() {
        assertEquals(6, logic.version2("1212"))
    }

    @test
    fun testV2SecondExample() {
        assertEquals(0, logic.version2("1221"))
    }

    @test
    fun testV2ThirdExample() {
        assertEquals(4, logic.version2("123425"))
    }

    @test
    fun testV2FourthExample() {
        assertEquals(12, logic.version2("123123"))
    }

    @test
    fun testV2FifthExample() {
        assertEquals(4, logic.version2("12131415"))
    }

}