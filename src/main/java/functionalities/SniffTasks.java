package functionalities;

import exception.SniffException;

import java.util.ArrayList;

public class SniffTasks {

    private static final ArrayList<Appointment> appointments = new ArrayList<Appointment>();

    private static int apptCount = 0;
    public void addAppointment() {
    }

    public void removeAppointment(int apptNum) throws SniffException {
        try {
            appointments.remove(apptNum);
        } catch (IndexOutOfBoundsException e) {
            throw new SniffException(" The remove command description is invalid!");
        }
    }

    public Appointment getAppointment(int apptNum) {
        return appointments.get(apptNum);
    }

    /**
     * Lists out all the appointment currently in the appointment list.
     */
    public void listAppointments() {
        for (int count = 0; count < apptCount; count++) {
            Appointment appt = getAppointment(count);
            String type = appt.getType();
            String animal = appt.getAnimal();
            String name = appt.getName();
            String date = appt.getDate();
            Ui.formatPrintList(Integer.toString(count + 1), type, animal, name, date);
        }
    }

    public void viewAppointment() {
    }
}
