import {useState, useEffect} from 'react';
import './App.css';
import {getAllStudents} from "./client";

function App() {
    // here we create an initial and empty  state
    const [students, setStudents] = useState([]);
    const fetchStudents = () => {
        getAllStudents()
            .then(response => response.json())
            .then(data => setStudents(data));
    };

    useEffect(() => {
        console.log("component is mounted ");
        fetchStudents();
    }, []);


  return <p>{students.length}</p>;
}

export default App;
