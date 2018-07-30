package io.ueong.dependencyfinder

import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.objectweb.asm.Opcodes

internal class JavaClassVisitorTest {
    private lateinit var classVisitor : JavaClassVisitor

    @Before
    fun setup() {
        classVisitor = JavaClassVisitor(Opcodes.ASM6)
    }

    @Test
    fun testJavaClassVisitorCreation() {
        assertNotNull(classVisitor)
    }

}