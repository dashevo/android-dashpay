package org.dashevo.dashpay

import org.dashevo.dpp.document.Document
import org.dashevo.platform.AbstractDocument

class Profile(document: Document) : AbstractDocument(document) {

    val displayName: String?
        get() = getFieldString("displayName")
    val publicMessage: String?
        get() = getFieldString("publicMessage")
    val avatarUrl: String?
        get() = getFieldString("avatarUrl")
    val avatarHash: ByteArray?
        get() = getFieldByteArray("avatarHash")
    val avatarFingerprint: ByteArray?
        get() = getFieldByteArray("avatarFingerprint")
}