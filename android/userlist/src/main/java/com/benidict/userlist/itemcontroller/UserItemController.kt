package com.benidict.userlist.itemcontroller

import com.airbnb.epoxy.TypedEpoxyController
import com.benidict.domain.model.User
import com.benidict.userlist.itemmodel.userItem

class UserItemController(
    private val actionItem: (User) -> Unit
): TypedEpoxyController<List<User>>(){

    override fun buildModels(data: List<User>) {
        val size = data.size
        for (i in 0 until size){
            userItem {
                id(i)
                user(data[i])
                clickListener { m, _, _, _ ->
                   actionItem(m.user)
                }
            }
        }
    }
}