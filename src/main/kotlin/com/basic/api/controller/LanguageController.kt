package com.basic.api.controller

import com.basic.api.model.Language
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/language")
class LanguageController {

    @PostMapping("/new")
    fun addLanguage(@RequestBody name: String) =
            Language(name)
}