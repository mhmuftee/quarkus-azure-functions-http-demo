package org.acme

import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {
    fun greeting(name: String): String {
        return "Guten Tag $name"
    }
}