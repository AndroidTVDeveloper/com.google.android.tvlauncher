package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

/* renamed from: bsz */
/* compiled from: PG */
public final class bsz implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Intent f4780a;

    /* renamed from: b */
    private final /* synthetic */ Activity f4781b;

    public bsz(Intent intent, Activity activity) {
        this.f4780a = intent;
        this.f4781b = activity;
    }

    public bsz() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = this.f4780a;
            if (intent != null) {
                this.f4781b.startActivityForResult(intent, 2);
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
