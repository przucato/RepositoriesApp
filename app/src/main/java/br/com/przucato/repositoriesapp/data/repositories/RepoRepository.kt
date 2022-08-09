package br.com.przucato.repositoriesapp.data.repositories

import br.com.przucato.repositoriesapp.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}