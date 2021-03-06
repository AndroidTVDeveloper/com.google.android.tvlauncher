package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;

/* compiled from: PG */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    private int a = 0;

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                bri a2 = bri.a(this);
                if (i2 == -1) {
                    Handler handler = a2.l;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    bno bno = new bno(13, null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!a2.a(bno, intExtra)) {
                        Handler handler2 = a2.l;
                        handler2.sendMessage(handler2.obtainMessage(5, intExtra, 0, bno));
                    }
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }

    private final void a() {
        AlertDialog alertDialog;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent == null) {
            bnu bnu = bnu.a;
            int intValue = num.intValue();
            bsz bsz = new bsz(bnu.a(this, intValue, "d"), this);
            if (intValue != 0) {
                TypedValue typedValue = new TypedValue();
                getTheme().resolveAttribute(16843529, typedValue, true);
                AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(this, 5) : null;
                if (builder == null) {
                    builder = new AlertDialog.Builder(this);
                }
                builder.setMessage(bsw.c(this, intValue));
                builder.setOnCancelListener(this);
                String e = bsw.e(this, intValue);
                if (e != null) {
                    builder.setPositiveButton(e, bsz);
                }
                String a2 = bsw.a(this, intValue);
                if (a2 != null) {
                    builder.setTitle(a2);
                }
                alertDialog = builder.create();
            } else {
                alertDialog = null;
            }
            if (alertDialog != null) {
                FragmentManager fragmentManager = getFragmentManager();
                bnq bnq = new bnq();
                Dialog dialog = (Dialog) buh.a(alertDialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                bnq.a = dialog;
                bnq.b = this;
                bnq.show(fragmentManager, "GooglePlayServicesErrorDialog");
            }
            this.a = 1;
        } else {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.a = 1;
            } catch (IntentSender.SendIntentException e2) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                finish();
            }
        }
    }
}
