package com.example.mvvmdictionary.feature_dictionary.domain.repository

import com.example.mvvmdictionary.core.util.Resource
import com.example.mvvmdictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {
    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}