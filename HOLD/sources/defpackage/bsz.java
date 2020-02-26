package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* renamed from: bsz  reason: default package */
/* compiled from: PG */
public final class bsz implements DialogInterface.OnClickListener {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Activity b;

    public bsz(Intent intent, Activity activity) {
        this.a = intent;
        this.b = activity;
    }

    public bsz() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = this.a;
            if (intent != null) {
                this.b.startActivityForResult(intent, 2);
            }
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } catch (Throwable th) {
            dialogInterface.dismiss();
            throw th;
        }
        dialogInterface.dismiss();
    }
}
