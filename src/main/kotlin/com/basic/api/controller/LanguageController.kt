package com.basic.api.controller

import com.basic.api.model.Language
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/language")
class LanguageController {

    private val languages: MutableList<Language> = ArrayList()

    @PostMapping("/new")
    fun addLanguage(@RequestBody name: String) =
            languages.add(Language(name))


    @GetMapping("/all")
    fun getAllLanguages() = languages
}