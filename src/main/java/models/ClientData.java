package models;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClientData {

    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;

    public ClientData(ObjectInputStream objectInputStream, ObjectOutputStream objectOutputStream) {
        this.objectInputStream = objectInputStream;
        this.objectOutputStream = objectOutputStream;
    }

    public ObjectInputStream getObjectInputStream() {
        return objectInputStream;
    }

    public ObjectOutputStream getObjectOutputStream() {
        return objectOutputStream;
    }

}
