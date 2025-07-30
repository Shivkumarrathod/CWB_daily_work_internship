import React,{useState,useEffect} from "react";
import tutorialServices from "../services/Tutorial-Services";
import { Link } from "react-router-dom";

const TutorialListComponent=()=>{
    const [tutorial,setTutorial]=useState([]);
    const [currentTutorial,setCurrentTutorial]=useState({});
    useEffect(() => {
    retrieveTutorials();
    }, []);
    const retrieveTutorials = () => {
    tutorialServices.getAllTutorials()
      .then((response) => {
        setTutorial(response.data);
        console.log(response.data);
      })
      .catch((e) => {
        console.log(e);
      });
    };
    const showTutorialDescription = (tutorial,index) => {
    setCurrentTutorial(tutorial);
    };
    return (
        <>
        <h1>Tutorial List Component</h1>
        <Link to={"/addTutorials"}>Add Tutorial</Link>
        {tutorial && tutorial.map((tutorial,index)=>(
            <p onClick={()=>showTutorialDescription(tutorial,index)}>{tutorial.title},{tutorial.description}</p>
        ))}
        <br/>
        <p>Click on the tutorial to get description below</p>
        <h2>Selected Tutorial:</h2>
        {currentTutorial.title}<br/>
        {currentTutorial.description}<br/>
        {currentTutorial.published?"Published":"Not Published"}<br/>
        <Link to={"/tutorials/" + currentTutorial.id}>Edit</Link>
        </>
    )
}
export default TutorialListComponent;