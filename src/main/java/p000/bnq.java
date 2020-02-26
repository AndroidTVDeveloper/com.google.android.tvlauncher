package p000;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: bnq */
/* compiled from: PG */
public final class bnq extends DialogFragment {

    /* renamed from: a */
    public Dialog f4486a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f4487b;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f4487b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f4486a == null) {
            setShowsDialog(false);
        }
        return this.f4486a;
    }
}
