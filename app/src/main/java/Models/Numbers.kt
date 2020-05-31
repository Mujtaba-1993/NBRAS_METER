package Models

import android.os.Parcel
import android.os.Parcelable

class Numbers(val hight: Int, val width: Int, val m2: Int):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(hight)
        parcel.writeInt(width)
        parcel.writeInt(m2)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Numbers> {
        override fun createFromParcel(parcel: Parcel): Numbers {
            return Numbers(parcel)
        }

        override fun newArray(size: Int): Array<Numbers?> {
            return arrayOfNulls(size)
        }
    }
}
