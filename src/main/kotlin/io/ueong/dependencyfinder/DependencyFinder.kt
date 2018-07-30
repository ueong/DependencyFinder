package io.ueong.dependencyfinder

import org.objectweb.asm.ClassVisitor

class JavaClassVisitor(api: Int) : ClassVisitor(api)