package com.xquare.data.user.repository

import com.xquare.core.data.Repository

abstract class UserRepository : Repository() {
	abstract fun login(
		accountId: String,
		password: String,
		deviceToken: String,
	)
}
