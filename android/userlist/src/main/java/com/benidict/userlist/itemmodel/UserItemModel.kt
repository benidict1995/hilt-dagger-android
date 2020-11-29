package com.benidict.userlist.itemmodel

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.benidict.core.helper.KotlinEpoxyHolder
import com.benidict.domain.model.User
import com.benidict.userlist.R
import com.google.android.material.textview.MaterialTextView

@EpoxyModelClass
abstract class UserItemModel : EpoxyModelWithHolder<UserItemModel.Holder>(){

    @EpoxyAttribute
    lateinit var user: User

    @EpoxyAttribute
    lateinit var clickListener: View.OnClickListener

    override fun getDefaultLayout(): Int = R.layout.item_user

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.tvName.text = user.name
        holder.tvEmail.text = user.email
        holder.tvNumber.text = user.phone
        holder.rootLayout.setOnClickListener(clickListener)
    }

    class Holder: KotlinEpoxyHolder(){
        val tvName by bind<MaterialTextView>(R.id.tv_name)
        val tvEmail by bind<MaterialTextView>(R.id.tv_email)
        val tvNumber by bind<MaterialTextView>(R.id.tv_number)
        val rootLayout by bind<ConstraintLayout>(R.id.root_layout)
    }
}