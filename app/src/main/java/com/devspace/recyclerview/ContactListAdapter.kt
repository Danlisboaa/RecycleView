package com.devspace.recyclerview

import android.provider.ContactsContract.Contacts
import android.view.View
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
//Adaptação entre o data class e o item_list layout
class ContactListAdapter :
    ListAdapter<Contact, ContactListAdapter.ContactViewHolder>(ContactDiffUtils()) {


        //view holder = view que segura os dados
    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
        //compara a diferença quando a lista é atualizada
    class ContactDiffUtils : DiffUtil.ItemCallback<Contact>() {
        override fun areItemsTheSame(oldItem: Contact, newItem: Contact): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Contact, newItem: Contact): Boolean {
            return oldItem.name == newItem.name
        }

    }
}