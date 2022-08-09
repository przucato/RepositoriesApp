package br.com.przucato.repositoriesapp.domain

import br.com.przucato.repositoriesapp.core.UseCase
import br.com.przucato.repositoriesapp.data.model.Repo
import br.com.przucato.repositoriesapp.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}