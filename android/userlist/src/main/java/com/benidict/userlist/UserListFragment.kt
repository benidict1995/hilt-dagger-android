package com.benidict.userlist

import androidx.fragment.app.viewModels
import com.benidict.core.base.BaseFragment
import com.benidict.core.enums.UiState
import com.benidict.core.utils.showToast
import com.benidict.userlist.databinding.FragmentUserListBinding
import com.benidict.userlist.itemcontroller.UserItemController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserListFragment : BaseFragment<FragmentUserListBinding>(
    FragmentUserListBinding::inflate
){

    private val viewModel: UserListViewModel by viewModels()

    private val controller by lazy{
        UserItemController{
            requireContext().showToast(it.name)
        }
    }

    override fun setUpView() {
        super.setUpView()
        viewBinding.epoxyRecycler.apply {
            setController(controller)
        }
    }

    override fun loadContent() {
        super.loadContent()
        viewModel.doLoadUserList.value = true
    }

    override fun observeLiveData() {
        super.observeLiveData()

        viewModel.loadUserList.observe(viewLifecycleOwner) {
            when (it) {
                is UiState.Loading -> {
                    requireContext().showToast("Loading...")
                }
                is UiState.Complete -> {
                    controller.setData(it.data)
                }
                is UiState.Error -> {
                    requireContext().showToast(it.error.message ?: "")
                }
            }
        }
    }
}